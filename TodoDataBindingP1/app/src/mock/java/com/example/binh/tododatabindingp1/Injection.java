package com.example.binh.tododatabindingp1;

import android.content.Context;
import android.support.annotation.NonNull;

import com.example.binh.tododatabindingp1.data.FakeTasksRemoteDataSource;
import com.example.binh.tododatabindingp1.data.source.TasksRepository;
import com.example.binh.tododatabindingp1.data.source.local.TasksLocalDataSource;

import static com.google.common.base.Preconditions.checkNotNull;

public class Injection {

    public static TasksRepository provideTasksRepository(@NonNull Context context) {
        checkNotNull(context);
        return TasksRepository.getInstance(FakeTasksRemoteDataSource.getInstance(),
                TasksLocalDataSource.getInstance(context));
    }

}
