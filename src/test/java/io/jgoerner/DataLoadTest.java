package io.jgoerner;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.neo4j.driver.v1.Config;
import org.neo4j.driver.v1.Driver;
import org.neo4j.driver.v1.GraphDatabase;
import org.neo4j.driver.v1.Session;
import org.neo4j.harness.ServerControls;
import org.neo4j.harness.TestServerBuilders;

import java.net.URL;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Unit test for simple Misc.
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class DataLoadTest {

    private static final Config driverConfig = Config.build().withoutEncryption().toConfig();
    private ServerControls embeddedDatabaseServer;

    @BeforeAll
    void initializeNeo4j() {

        this.embeddedDatabaseServer = TestServerBuilders
                .newInProcessBuilder()
                .withProcedure(DataLoad.class)
                .newServer();
    }


    @Test
    void shouldLoadData() {

        // This is in a try-block, to make sure we close the driver after the test
        try(Driver driver = GraphDatabase.driver(embeddedDatabaseServer.boltURI(), driverConfig);
            Session session = driver.session()) {
            // given
            URL url = ClassLoader.getSystemResource("rebel-snowspeeder-assembly-excerpt.csv");

            // When
            session.run( "CALL t47.init('" + "file://" + url.getPath() + "')");
            Long result = session.run("MATCH (n) RETURN COUNT(*) as cnt").single().get("cnt").asLong();

            // Then
            assertThat(result).isEqualTo( 5L );
        }
    }
}