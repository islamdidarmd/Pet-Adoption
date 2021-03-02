/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.ui.data

data class Pet(
    val title: String,
    val center: String,
    val location: String,
    val image: String,
)

fun getDemoPetList(): List<Pet> {
    return listOf(
        Pet(
            "Affenpinscher",
            "Kitten Rescue Center",
            "Melbourn",
            "http://78.media.tumblr.com/2bc94b9eec2d00f5d28110ba191da896/tumblr_nyled8DYKd1qg9kado1_1280.jpg"
        ),
        Pet(
            "Afghan Hound",
            "Dog Rescue Center",
            "Dhaka",
            "http://78.media.tumblr.com/75f7f5ba97da53c61026fe6cad16c97c/tumblr_o8h7llrbDt1rzz2who1_1280.jpg"
        ),
        Pet(
            "African Hunting Dog",
            "K Kitten Rescue Center",
            "Kolkata",
            "http://78.media.tumblr.com/84f729a7130860dda9b7544664a36094/tumblr_nvgiskSmew1un7zabo3_r1_1280.jpg"
        ),
        Pet(
            "Akbash Dog",
            "Ham Rescue Center",
            "Hamburg",
            "http://78.media.tumblr.com/6fb13a48907b7d65f79a07afdc9c5ebe/tumblr_nhlytoREfQ1rvsh0oo1_1280.jpg"
        ),
        Pet(
            "Akita",
            "Berlin Rescue Center",
            "Berlin",
            "http://78.media.tumblr.com/4217786db510db68daed375cea8ec4d9/tumblr_nlf1ggSff71ruv93po1_1280.jpg"
        ),
        Pet(
            "Bulldog",
            "SF Bay Rescue Center",
            "SF Bay",
            "http://78.media.tumblr.com/a9c056e66b11e1a91a9a03d8c0d04e89/tumblr_o7uwyquvpM1qjcdw9o1_1280.png"
        ),
        Pet(
            "Husky",
            "Melbourn Rescue Center",
            "Melbourn",
            "http://78.media.tumblr.com/9666e3107587fa2dd7833033ec42b7ba/tumblr_o0ymimYfp71rozzl0o1_1280.jpg"
        ),
        Pet(
            "Malamute",
            "New York Rescue Center",
            "New York",
            "http://78.media.tumblr.com/9b5ed3d0bcd102bb028f137267082777/tumblr_o6zaks1SvQ1qjcdw9o1_1280.jpg"
        ),
        Pet(
            "American Bulldog",
            "Berlin Kitten Rescue Center",
            "Berlin",
            "http://78.media.tumblr.com/766f297cf8b282cd2820fc4c9161c328/tumblr_o7hktkxin01qjcdw9o1_1280.jpg"
        ),
        Pet(
            "Akita",
            "Berlin Rescue Center",
            "Berlin",
            "http://78.media.tumblr.com/5230380780945425e867a0a3aaa6f4b0/tumblr_n8w47dGOhd1r7qbtpo1_1280.jpg"
        ),
        Pet(
            "Bulldog",
            "SF Bay Rescue Center",
            "SF Bay",
            "http://78.media.tumblr.com/a9c056e66b11e1a91a9a03d8c0d04e89/tumblr_o7uwyquvpM1qjcdw9o1_1280.png"
        ),
        Pet(
            "Husky",
            "Melbourn Rescue Center",
            "Melbourn",
            "http://78.media.tumblr.com/a9c056e66b11e1a91a9a03d8c0d04e89/tumblr_o7uwyquvpM1qjcdw9o1_1280.png"
        ),
    )
}
