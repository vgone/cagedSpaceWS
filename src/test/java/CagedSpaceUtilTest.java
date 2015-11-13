import com.uncc.cagedspace.CagedSpaceWS.CagedSpace;
import com.uncc.cagedspace.CagedSpaceWS.CagedSpaceUtil;
import org.junit.Test;

/**
 * Created by tarun on 11/8/15.
 */
public class CagedSpaceUtilTest {

    @Test
    public void testGetJSON() {
        CagedSpace jsonData = CagedSpaceUtil.getJSONData();
        System.out.println(jsonData.getEventName());
    }


}
