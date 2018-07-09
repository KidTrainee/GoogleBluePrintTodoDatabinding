package com.example.binh.tododatabindingp1.data.source;

import android.support.annotation.NonNull;

import com.example.binh.tododatabindingp1.data.model.Task;

import java.util.List;

public interface TasksDataSource {

    interface LoadTasksCallback {

        void onTasksLoaded(List<Task> tasks);

        void onDataNotAvailable();
    }

    interface GetTaskCallback {

        void onTaskLoaded(Task task);

        void onDataNotAvailable();
    }

    void refreshTasks();

    void getTasks(@NonNull LoadTasksCallback callback);

}
