package learnAnnotations;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

public class LearnTestNGListeners implements IRetryAnalyzer, IAnnotationTransformer{

	int count = 1;
	@Override
	public boolean retry(ITestResult result) {
		if(!result.isSuccess() && count<2) {
			count++;
			return true;
		}
		return false;
	}
	@Override
	public void transform(ITestAnnotation annotation, Class testClass, 
			        Constructor testConstructor, Method testMethod) {
		if (testMethod.getName().equals("mergeLead")) {
			annotation.setInvocationCount(2);  
		}
        // annotation.setRetryAnalyzer(this.getClass());
		
	}

	
	
}





