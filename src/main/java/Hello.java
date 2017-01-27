/**
 * Created by Nek on 2017-01-27.
 */
import static spark.Spark.*;

public class Hello {
    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello world!");
    }
}