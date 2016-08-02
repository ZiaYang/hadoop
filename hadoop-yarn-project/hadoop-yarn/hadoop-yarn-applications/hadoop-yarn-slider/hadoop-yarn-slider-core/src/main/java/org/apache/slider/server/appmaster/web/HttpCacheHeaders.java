/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.slider.server.appmaster.web;

/*


  ,  );
  long now = System.currentTimeMillis();
  httpRes.addDateHeader ( "Expires", now );
  httpRes.addDateHeader ( "Date", now );
  httpRes.addHeader ( "Pragma", "no-cache" );
 */
public interface HttpCacheHeaders {
  String HTTP_HEADER_CACHE_CONTROL = "Cache-Control";
  String HTTP_HEADER_CACHE_CONTROL_NONE = "no-cache";
  String HTTP_HEADER_PRAGMA = "Pragma";

}
