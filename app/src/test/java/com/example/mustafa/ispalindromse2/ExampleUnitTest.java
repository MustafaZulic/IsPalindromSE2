package com.example.mustafa.ispalindromse2;

import android.view.View;
import android.widget.EditText;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */

@RunWith(Parameterized.class)
public class ExampleUnitTest {


    private String input;
    private boolean expected;


    public ExampleUnitTest(String input, boolean expected){

        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection data(){

        return Arrays.asList(new Object[][]{

                {"fiiif", true},
                {"abbba", true},
                {"madam", true},

                //falsche werte
                {"Affe", false},
                {"Blume", false},
                {"Tonne", false}
        });
    }
    @Test
    public void TesteObPalindromTrue() {


       assertEquals(expected, MainActivity.isPalindrome(input));
    }

}