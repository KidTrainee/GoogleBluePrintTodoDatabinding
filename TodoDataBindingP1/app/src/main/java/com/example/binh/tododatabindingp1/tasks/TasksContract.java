package com.example.binh.tododatabindingp1.tasks;

import com.example.binh.tododatabindingp1.BasePresenter;
import com.example.binh.tododatabindingp1.BaseView;

public interface TasksContract {
    interface Presenter extends BasePresenter{

        void loadTasks(boolean forceUpdate);

    }

    interface View extends BaseView<Presenter> {

        void setLoadingIndicator(boolean active);
    }
}
