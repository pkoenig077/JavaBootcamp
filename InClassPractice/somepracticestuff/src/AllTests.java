import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ BaseEncodeTest.class, IsCardMatchTest.class, RoundingTest.class })
public class AllTests {

}
