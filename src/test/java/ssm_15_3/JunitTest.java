package ssm_15_3;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ssm.service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration("classpath:applicationContext.xml")  
public class JunitTest {

	@Resource(name="userService")
	private IUserService userService;
	
	@Test
	public void test() {
		userService.addUser();
	}

}
