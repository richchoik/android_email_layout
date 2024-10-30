package com.example.emaillayout

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class EmailAdapter(private val context: Context, private val emailList: List<Email>) : BaseAdapter() {

    override fun getCount(): Int = emailList.size

    override fun getItem(position: Int): Any = emailList[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View = convertView ?: LayoutInflater.from(context).inflate(R.layout.email_item, parent, false)
        val email = emailList[position]

        val senderTextView = view.findViewById<TextView>(R.id.senderTextView)
        val subjectTextView = view.findViewById<TextView>(R.id.subjectTextView)
        val snippetTextView = view.findViewById<TextView>(R.id.snippetTextView)
        val timeTextView = view.findViewById<TextView>(R.id.timeTextView)

        senderTextView.text = email.sender
        subjectTextView.text = email.subject
        snippetTextView.text = email.snippet
        timeTextView.text = email.time

        return view
    }
}
