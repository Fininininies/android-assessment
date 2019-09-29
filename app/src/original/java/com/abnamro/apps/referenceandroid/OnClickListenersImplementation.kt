package com.abnamro.apps.referenceandroid

import android.support.design.widget.Snackbar
import android.view.View

object OnClickListenersImplementation: MainActivityOnClickListeners {

    override fun getFabOnClickListener():View.OnClickListener {
        return View.OnClickListener { view ->
            if (view != null) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
            }
        }
    }
}
