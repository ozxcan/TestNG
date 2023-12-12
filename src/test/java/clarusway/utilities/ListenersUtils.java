package clarusway.utilities;

import org.testng.*;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ListenersUtils implements ITestListener, IRetryAnalyzer, IAnnotationTransformer {
    @Override
    public void onStart(ITestContext result) {
        //Test balsadiginda calisir
        System.out.println("Test basladi  "+ result.getStartDate());
    }

    @Override
    public void onFinish(ITestContext result) {
      // Test bittiginde calisir
        System.out.println("Test Bitti "+result.getEndDate());
    }

    @Override
    public void onTestStart(ITestResult result) {
        // Her test öncesi calisir
        System.out.println(result.getName()+"Testi basladi...");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println(result.getName()+" Testi skip oldu");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        // her basarili tessten sonra calisir
        System.out.println(result.getName()+" Testi success oldu");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        //Test fail oldugunda calisir!!
        System.err.println(result.getName()+" Testi failure");
    }
    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // Başarı yüzdesi içinde başarısız olan bir test çalıştığında çalışır
        // Burada bir işlem yapılmamış
    }
    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        // Zaman aşımı nedeniyle başarısız olan bir test çalıştığında çalışır
        System.out.println(result.getName() + " testi zaman aşımına uğradığı için başarısız oldu...");
    }
    // Otomatik olarak Başarısız Test Senaryolarını bir kez daha yeniden çalıştırır
// IRetryAnalyzer Yöntemi Uygulanmıştır
// BU yöntem, BAŞARISIZ TEST SENARYOLARINI YENİDEN ÇALIŞTIRMAK İÇİN OTOMATİK OLARAK ÇAĞRILACAKTIR
    private int retryCount = 0;
    private static final int maxRetryCount = 5; // YENİDEN ÇALIŞTIRMA SAYISI toplam 6 kez calisir
    @Override
    public boolean retry(ITestResult result) {
        if (retryCount < maxRetryCount) {
            retryCount++;
            return true;
        }
        return false;
    }

    // IAnnotationTransformer yöntemi eklenmiştir
// Bu, başarısız test senaryolarını otomatik olarak testng xml dosyalarını kullanarak yeniden çalıştırır
    @Override
    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
        annotation.setRetryAnalyzer(ListenersUtils.class);
    }



}
