package commands
import org.crsh.cli.Command
import org.crsh.cli.Usage
import org.crsh.command.InvocationContext

class hello{
    @Usage("Say Hello")
    @Command
    static
    def main(InvocationContext context){
        def bootVersion = context.attributes['spring.boot.version'];
        def springVersion = context.attributes['spring.version']

        return "Hello, your Spring Boot Version is "+ bootVersion +
                ", your Spring Framework version is "+ springVersion
    }
}