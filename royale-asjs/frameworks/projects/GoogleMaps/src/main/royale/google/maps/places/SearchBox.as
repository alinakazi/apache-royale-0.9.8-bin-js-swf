/*
 * Copyright 2010 The Closure Compiler Authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/*
 * This file was generated from Google's Externs for the Google Maps v3.11 API.
 */
package google.maps.places {

import google.maps.MVCObject;
import google.maps.LatLngBounds;
import google.pseudo.Node;
import google.pseudo.HTMLInputElement;

/**
 * @see [google_maps_api_v3_11]
 * @constructor extends google.maps.MVCObject */
public class SearchBox extends google.maps.MVCObject {

    /**
     * @param inputField [(HTMLInputElement|null)] 
     * @param opt_opts [(Object<?,string>|google.maps.places.SearchBoxOptions|null|undefined)] 
     * @see [google_maps_api_v3_11]
     */
    public function SearchBox(inputField:HTMLInputElement, opt_opts:Object = null) {
        super();
    }

    /**
     * @see [google_maps_api_v3_11]
     * @returns {(Array<(google.maps.places.PlaceResult|null)>|null)} 
     */
    public function getPlaces():Array {  return null; }

    /**
     * @see [google_maps_api_v3_11]
     * @returns {(google.maps.LatLngBounds|null)} 
     */
    public function getBounds():google.maps.LatLngBounds {  return null; }

    /**
     * @param bounds [(google.maps.LatLngBounds|null)] 
     * @see [google_maps_api_v3_11]
     * @returns {undefined} 
     */
    public function setBounds(bounds:google.maps.LatLngBounds):Object /* undefined */ {  return null; }

}
}
