package com.example.binh.tododatabindingp1.data;

import com.example.binh.tododatabindingp1.data.source.TasksDataSource;

public class FakeTasksRemoteDataSource implements TasksDataSource{

    private static FakeTasksRemoteDataSource INSTANCE;

    // Prevent direct instantiation.
    private FakeTasksRemoteDataSource() {}

    public static FakeTasksRemoteDataSource getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new FakeTasksRemoteDataSource();
        }
        return INSTANCE;
    }
}
