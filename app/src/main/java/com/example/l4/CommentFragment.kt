package com.example.l4


import android.content.Intent
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import com.example.l4.databinding.FragmentCommentBinding

/**
 * A simple [Fragment] subclass.
 */
class CommentFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentCommentBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_comment, container, false)
        arguments?.let {
            val args  =  CommentFragmentArgs.fromBundle(it)
            binding.finalComment.text = args.comment
        }
        setHasOptionsMenu(true)
        return binding.root
    }

    private fun getShareIntent():Intent{
        val args = CommentFragmentArgs.fromBundle(arguments!!)
        val shareIntent = Intent(Intent.ACTION_SEND)
        shareIntent.setType("text/plain")
            .putExtra(Intent.EXTRA_TEXT, args.comment)
        return shareIntent
    }

    private fun shareSucces(){
        startActivity(getShareIntent())
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater?.inflate(R.menu.options_share, menu)
        if(null == getShareIntent().resolveActivity(activity!!.packageManager))
        {
            menu?.findItem(R.id.share).setVisible(false)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item!!.itemId)
        {
            R.id.share -> shareSucces()
        }
        return super.onOptionsItemSelected(item)
    }
}
