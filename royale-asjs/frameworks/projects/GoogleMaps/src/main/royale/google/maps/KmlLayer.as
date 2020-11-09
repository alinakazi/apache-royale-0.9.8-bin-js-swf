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
package google.maps {

/**
 * @see [google_maps_api_v3_11]
 * @constructor extends google.maps.MVCObject */
public class KmlLayer extends google.maps.MVCObject {

    /**
     * @param opt_opts [(Object<?,string>|google.maps.KmlLayerOptions|null|undefined)] 
     * @see [google_maps_api_v3_11]
     */
    public function KmlLayer(opt_opts:Object = null) {
        super();
    }

    /**
     * @see [google_maps_api_v3_11]
     * @returns {(google.maps.KmlLayerStatus|null)} 
     */
    public function getStatus():google.maps.KmlLayerStatus {  return null; }

    /**
     * @see [google_maps_api_v3_11]
     * @returns {string} 
     */
    public function getUrl():String {  return null; }

    /**
     * @param url [string] 
     * @see [google_maps_api_v3_11]
     * @returns {undefined} 
     */
    public function setUrl(url:String):Object /* undefined */ {  return null; }

    /**
     * @see [google_maps_api_v3_11]
     * @returns {(google.maps.LatLngBounds|null)} 
     */
    public function getDefaultViewport():google.maps.LatLngBounds {  return null; }

    /**
     * @param map [(google.maps.Map|null)] 
     * @see [google_maps_api_v3_11]
     * @returns {undefined} 
     */
    public function setMap(map:google.maps.Map):Object /* undefined */ {  return null; }

    /**
     * @see [google_maps_api_v3_11]
     * @returns {(google.maps.KmlLayerMetadata|null)} 
     */
    public function getMetadata():google.maps.KmlLayerMetadata {  return null; }

    /**
     * @see [google_maps_api_v3_11]
     * @returns {(google.maps.Map|null)} 
     */
    public function getMap():google.maps.Map {  return null; }

}
}
