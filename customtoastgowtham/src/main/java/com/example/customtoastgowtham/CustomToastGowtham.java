package com.example.customtoastgowtham;

import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class CustomToastGowtham {
    public static void showToast(Context context, String message, int color, int gravity) {

        try {
            Toast toast;
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            final View layout = inflater.inflate(R.layout.custom_toast, null);
            layout.setBackgroundColor(context.getResources().getColor(color));
            toast = new Toast(context);
            toast.setGravity(Gravity.FILL_HORIZONTAL | gravity, 0, 0);
            toast.setDuration(Toast.LENGTH_LONG);
            toast.setView(layout);
            toast.show();

            TextView tvToast = (TextView) toast.getView().findViewById(R.id.tv_toast);
            tvToast.setText(message);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
