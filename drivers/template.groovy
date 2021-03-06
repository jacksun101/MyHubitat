/*
 * Import URL: https://raw.githubusercontent.com/HubitatCommunity/??/master/??-Driver.groovy"
 *
 *    Copyright 2019 Your Name
 *
 *    Licensed under the Apache License, Version 2.0 (the "License"); you may not
 *    use this file except in compliance with the License. You may obtain a copy
 *    of the License at:
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 *    WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 *    License for the specific language governing permissions and limitations
 *    under the License.
 */
     
public static String version()      {  return 'v???'  }

metadata
{
    definition(name: 'JustA Driver', namespace: 'yourame', author: 'Your Name', importUrl: 'https://raw.githubusercontent.com/HubitatCommunity/??/master/??.groovy')
    {
         capability 'Switch'
    }

      preferences
      {
          //standard logging options
          input name: 'logEnable', type: 'bool', title: 'Enable debug logging', defaultValue: true
      }
}

/*
    updated
    Doesn't do much other than call initialize().
*/
def updated() {
    initialize()
    unschedule()
      if (debugOutput) runIn(1800, logsOff) //disable debug logs after 30 min
    log.trace 'Msg: updated ran'
}

/*
    generic driver stuff
*/

/*
    installed
    Doesn't do much other than call initialize().
*/
def installed() {
    initialize()
    log.trace 'Msg: installed ran'
}

/*
    initialize
    Doesn't do anything.
*/
def initialize() {
    log.trace 'Msg: initialize ran'
}

/*
    parse
    In a virtual world this should never be called.
*/
def parse(String description) {
    log.trace "Msg: Description is $description"
}

/*
    on
    Turns the device on.
*/
def on() {
    // The server will update on/off status
    log.trace "Msg: $description ON"
}

/*
    off
    Turns the device off.
*/
def off() {
    // The server will update on/off status
    log.trace "Msg: $description OFF"
}

def getThisCopyright() { '&copy; 2019 Your Name ' }
