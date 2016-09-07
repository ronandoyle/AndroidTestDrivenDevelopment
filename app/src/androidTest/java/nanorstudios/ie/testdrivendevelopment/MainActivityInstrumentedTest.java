package nanorstudios.ie.testdrivendevelopment;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.Espresso;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 */
@RunWith(AndroidJUnit4.class)
public class MainActivityInstrumentedTest {

    private int addedValue;
    private int subtractedValue;

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Before
    public void setUp() {
        addedValue = 1;
        subtractedValue = -1;
    }

    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();
        assertEquals("nanorstudios.ie.testdrivendevelopment", appContext.getPackageName());
    }

    @Test
    public void clickAddButton() {
        onView(withId(R.id.button_add))
                .perform(click());

        onView(withId(R.id.text_view_counter))
                .check(matches(withText(String.valueOf(addedValue))));
    }

    @Test
    public void clickSubtractButton() {
        onView(withId(R.id.button_subtract))
                .perform(click());

        onView(withId(R.id.text_view_counter))
                .check(matches(withText(String.valueOf(subtractedValue))));
    }

    @Test
    public void clickOpenAnotherActivity() {
        onView(withId(R.id.button_open_another_activity))
                .perform(click());

        onView(withId(R.id.text_view_message))
                .check(matches(withText(R.string.this_is_just_another_activity)));
    }
}