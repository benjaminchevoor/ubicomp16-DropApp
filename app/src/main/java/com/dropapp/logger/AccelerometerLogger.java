package com.dropapp.logger;

import android.content.Context;

import com.dropapp.services.AccelerometerService;

import java.io.IOException;

/**
 * Created by benjaminchevoor on 4/5/16.
 */
public class AccelerometerLogger {

    public static void logTransition(Context context, AccelerometerService.AccelerometerDropModel.State state) throws IOException, Logger.LogWriteException {
        Logger.log(context, "Accelerometer state transitioning to", state.toString());
    }

}
