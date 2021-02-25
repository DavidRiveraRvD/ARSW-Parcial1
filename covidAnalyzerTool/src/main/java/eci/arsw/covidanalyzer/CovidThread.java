package eci.arsw.covidanalyzer;

import java.io.File;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class CovidThread extends Thread{
    private ResultAnalyzer result;
    private TestReader test;
    private AtomicInteger atomic;
    private List<File> resultList;

    private boolean bandera;

    public void continueThread(){
        bandera = false;
        synchronized (this){
            notifyAll();
        }
    }

    public void espera(){
        bandera = true;
    }

    public void run(){
        int count = 0;
        int longi = resultList.size();

        for(File transactionFile : resultList) {
            List<Result> resultados = test.readResultsFromFile(transactionFile);
            for(Result res : resultados) {
                result.addResult(res);
            }
            atomic.incrementAndGet();
            count++;
        }
    }
}
