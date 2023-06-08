import com.rbtxm.LazySingleton;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * 单例模式测试类
 *
 * @author guanxiangkai
 * @version 1.0
 * @since 2023年06月08日 星期四 23时26分46秒
 */
@Slf4j
public class SingletonTest {
    public static void main(String[] args) {
        log.info("Hello World!");
    }
    @Test
    public void testDclSingleton() {
        log.info("instance1 == instance2");
    }
    @Test
    public void testEagerSingleton() {
        LazySingleton instance1 = LazySingleton.getInstance();
        LazySingleton instance2 = LazySingleton.getInstance();
        log.info("instance1 == instance2: {}", instance1 == instance2);
    }
    @Test
    public void testLazySingleton() {
        LazySingleton instance1 = LazySingleton.getInstance();
        LazySingleton instance2 = LazySingleton.getInstance();
        log.info("instance1 == instance2: {}", instance1 == instance2);
    }
}
