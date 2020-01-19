package io.jgoerner;

import org.neo4j.procedure.Description;
import org.neo4j.procedure.Procedure;

import java.util.stream.Stream;

/**
 * Simple procedure to test e2e functionality
 */
public class Misc
{
    @Procedure("t47.ping")
    @Description("t47.ping - returns poing")
    public Stream<Output> ping() {
        return Stream.of(new Output("pong"));
    }

    public class Output{
        public String out;
        Output(String out) { this.out = out; }
    }

}
