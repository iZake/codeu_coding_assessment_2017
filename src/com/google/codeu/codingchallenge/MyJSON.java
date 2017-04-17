// Copyright 2017 Google Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.codeu.codingchallenge;

import java.util.Collection;

final class MyJSON implements JSON {
MyJSON temp = new MyJSON();
  @Override
  public JSON getObject(String name) {
    // TODO: implement this
	  temp = "{" + "\"" + name  + "\"" + "}"; 
    return temp;
  }

  @Override
  public JSON setObject(String name, JSON value) {
    // TODO: implement this
    return this.value = { + name + };
  }

  @Override
  public String getString(String name) {
    // TODO: implement this
    return "\"" + name + "\"";
  }

  @Override
  public JSON setString(String name, String value) {
    // TODO: implement this
    return this.name = value;
  }

  @Override
  public void getObjects(Collection<String> names) {
    // TODO: implement this
    String objects = "";
    for(int i = 0; i < names.size(); i++)
    {
    	//objects = "\"" + getObject(names) + "\"" + " ,";
    	names.add(getObjects());
    }
    //objects.removeCharAt(objects.lastIndexOf(","));
  }

  @Override
  public void getStrings(Collection<String> names) {
    // TODO: implement this
    String str = "";
 	for(int i = 0; i < names.size(); i++)
    {
    	str = str + getString(names[i]) + ",";
    }
    str = str.substring(0,str.lastIndexOf(","));
  }
}
