/*
 * Copyright 2020 Tim Herreijgers
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package nl.timherreijgers.motorcycleridestatistics.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProviders

import nl.timherreijgers.motorcycleridestatistics.R
import nl.timherreijgers.motorcycleridestatistics.databinding.FragmentMainBinding
import nl.timherreijgers.motorcycleridestatistics.viewmodels.MainFragmentViewModel

class MainFragment : Fragment() {

    private lateinit var viewDataBinding: FragmentMainBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        viewDataBinding = FragmentMainBinding.inflate(inflater, container, false).apply {
            viewmodel = ViewModelProviders.of(this@MainFragment).get(MainFragmentViewModel::class.java)
            lifecycleOwner = viewLifecycleOwner
        }

        viewDataBinding.viewmodel?.mainText?.postValue("Hoi")
        return viewDataBinding.root
    }

}
