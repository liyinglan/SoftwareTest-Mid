import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;


public class ScheduleTest {

	private Schedule schedule;
	
	@Test
	public void test() {
		//fail("Not yet implemented");
		
		Work a = new Work("A", 0, 3);
		Work b = new Work("B", 1, 5);
		Work c = new Work("C", 1, 8);
		
		List<Work> works = new ArrayList<Work>();
		
		List<Work> worksB = new ArrayList<Work>();
		
		works.add(a);
		works.add(b);
		works.add(c);
		
		List<Double> lst = new ArrayList<Double>();
		List<Double> ans = new ArrayList<Double>();
		
		schedule = new Schedule();
		
		assertEquals(0, a.getPriority());
		
		//2, 3, 3
		double da = 8.33333333333333334;
		double db = 1.425;
		
		ans.add(da);
		ans.add(db);
		assertThat(ans, equalTo(schedule.FCFS(works)));
		
		Work d = new Work("D", 0, 5);
		Work e = new Work("E", 0, 3);
		Work f = new Work("F", 1, 6);
		List<Work> worksC = new ArrayList<Work>();
		worksC.add(d);
		worksC.add(e);
		worksC.add(f);
		
		List<Double> ansB = new ArrayList<Double>();
		double dc = 8.0;
		double dd = 1.5888888888888888;
		
		ansB.add(dc);
		ansB.add(dd);
		assertThat(ansB, equalTo(schedule.SJF(worksC)));
		
		worksB.add(b);
		
		schedule.SJF(worksB);
		
		
	}

}
