package edu.ucdavis.kdegtiarenko.sunshine;

import android.test.suitebuilder.TestSuiteBuilder;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Created by kdegtiarenko on 1/30/2015.
 */
public class fullTestSuite extends TestSuite {
        public static Test suite() {
            return new TestSuiteBuilder(fullTestSuite.class)
                    .includeAllPackagesUnderHere().build();
        }

        public fullTestSuite() {
            super();
        }
}
