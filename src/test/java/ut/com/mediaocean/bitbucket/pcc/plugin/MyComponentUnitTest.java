package ut.com.mediaocean.bitbucket.pcc.plugin;

import org.junit.Test;
import com.mediaocean.bitbucket.pcc.plugin.api.MyPluginComponent;
import com.mediaocean.bitbucket.pcc.plugin.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}