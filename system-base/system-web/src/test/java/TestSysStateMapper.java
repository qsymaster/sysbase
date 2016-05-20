
import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.qsy.common.po.SysStatePo;
import com.qsy.common.util.SysUtils;
import com.qsy.service.mapper.SysStateMapper;

@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration({"classpath*:spring-mybatis.xml"})
@Transactional
public class TestSysStateMapper {
	@Resource
	private SysStateMapper sysStateMapper;
	
	@Test
    public void save(){
    	SysStatePo statePo = new SysStatePo();
    	statePo.setId(SysUtils.getInstance().getUUID());
    	statePo.setGroupName("common");
    	statePo.setStateName("删除");
    	statePo.setDescription("所有表公用状态");
    	statePo.setSortNum(0);
    	sysStateMapper.save(statePo);
    }
    
	

}
