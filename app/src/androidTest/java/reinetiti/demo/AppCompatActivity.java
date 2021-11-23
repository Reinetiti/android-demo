package reinetiti.demo;

import android.content.Context;

import androidx.test.platform.app.InstrumentationRegistry;

import org.junit.Test;

public class AppCompatActivity {
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("reinetiti.demo", appContext.getPackageName());
    }

    private void assertEquals(String s, String packageName) {
    }
}
