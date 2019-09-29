package com.abnamro.apps.referenceandroid

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.support.v4.content.ContextCompat.startActivity
import android.view.View

object OnClickListenersImplementation: MainActivityOnClickListeners {

    override fun getFabOnClickListener(): View.OnClickListener {
        return View.OnClickListener { view ->
            if (view != null) {
                val context = view.context
                val mailIntent = Intent(Intent.ACTION_SENDTO)
                mailIntent.data = Uri.parse("mailto:")
                mailIntent.putExtra(
                    Intent.EXTRA_SUBJECT, getStringResource(context, R.string.email_subject)
                )
                mailIntent.putExtra(
                    Intent.EXTRA_TEXT, getStringResource(context, R.string.email_body)
                )
                if (mailIntent.resolveActivity(context.packageManager) != null) {
                    startActivity(context, mailIntent, null)
                }
            }
        }
    }

    private fun getStringResource(context: Context, id:Int):String {
        return context.resources.getString(id)
    }
}