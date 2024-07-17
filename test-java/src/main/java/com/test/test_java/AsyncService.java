package com.test.test_java;


import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncService {

    @Async
    public void processData() {
        try {
            // Simulasi pemrosesan data yang memakan waktu lama
            Thread.sleep(3000); // 5 menit
            System.out.println("Pemrosesan data selesai.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
