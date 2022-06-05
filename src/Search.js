import React from 'react';
import './Search.css';

export default function Search () {
    return (
        <div class=" flex space-betweem h-screen bg-cloud-blue p-2.5">
            <div class="mr-5 w-1/2">
                <div id="summary" class="pb-5">
                    <div class="pb-2">
                        <span class="text-2xl">Summary</span>
                    </div>
                    <div class="border-2 rounded-md p-1 border-sea-blue">
                        <span>
                            An airport is an aerodrome with extended facilities, mostly for commercial air 
                            transport. Airports usually consists of a landing area, which comprises an aerially 
                            accessible open space including at least one operationally active surface such as a runway 
                            for a plane to take off and to land or a helipad, and often includes adjacent utility buildings 
                            such as control towers, hangars and terminals, to maintain and monitor aircraft. Larger airports 
                            may have airport aprons, taxiway bridges, air traffic control centres, passenger facilities such 
                            as restaurants and lounges, and emergency services. In some countries, the US in particular, 
                            airports also typically have one or more fixed-base operators, serving general aviation.
                        </span>
                    </div>
                </div>
                <div id="links">
                    <div class="pb-2">
                        <span class="text-2xl">Links</span>
                    </div>
                </div>
            </div>
            <div id="videos" class="w-1/2">
                <div class="pb-2">
                    <span class="text-2xl">Videos</span>
                </div>
            </div>
        </div>
    );
}