/*
 * The MIT License
 *
 */
package jenkins.plugins.testlink.examples;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Tests System.currentTimeMillis()
 * 
 * @author Bruno P. Kinoshita - http://www.kinoshita.eti.br
 * @since 0.3
 */
public class TestCurrentTime
{

        @Test
        public void testCurrentTime() 
        {
                Assert.assertNotNull( System.currentTimeMillis() );
                
                Assert.assertTrue( System.currentTimeMillis() <0  );
        }
        
}
