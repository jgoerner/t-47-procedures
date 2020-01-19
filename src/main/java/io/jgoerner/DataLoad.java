package io.jgoerner;

import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.procedure.*;

public class DataLoad {

    // This field declares that we need a GraphDatabaseService
    // as context when any procedure in this class is invoked
    @Context
    public GraphDatabaseService db;

    /**
     * Helper procedure to bundle initial data load
     */
    @Procedure(value="t47.init", mode=Mode.WRITE)
    @Description("t47.init - loads initial data and constructs graph")
    public void init(
            @Name(value="uri", defaultValue="file:///rebel-snowspeeder-assembly.csv") String uri
    ) {
        db.execute(
                "LOAD CSV WITH HEADERS FROM '" + uri + "' AS row " +
                        "MERGE (a:Assembly {desc: row.`sub-assembly`}) " +
                        "MERGE (p:Part {pid: row.part, url: row.`part-url`}) " +
                        "MERGE (s:Step {localId: row.step, page: row.page}) " +
                        "MERGE (s)-[:NEEDS {qty: row.quantity}]->(p) " +
                        "MERGE (a)-[:CONSISTS_OF]->(s) "
        );
    }
}
