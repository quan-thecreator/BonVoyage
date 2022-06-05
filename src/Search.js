import React from 'react';
import ReactPlayer from 'react-player';
import './Search.css';

export default function Search () {
  return (
    <div class="flex overflow-hidden overflow-y-auto space-betweem h-screen bg-cloud-blue p-2.5">
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
        <div id="links" class="pb-5">
          <div class="pb-2">
            <span class="text-2xl">Links</span>
          </div>
          <div class="border-2 rounded-md p-1 border-sea-blue">
            <li class="list-none underline">
              <ul><a href="https://www.merriam-webster.com/dictionary/sea">Sea Definition & Meaning - Merriam-Webster</a></ul>
              <ul><a href="https://www.sea.com/">Sea</a></ul>
              <ul><a href="https://www.nationalgeographic.org/encyclopedia/sea/">Sea | National Geographic Society</a></ul>
            </li>
          </div>
        </div>
        <div id="research">
          <div class="pb-2">
            <span class="text-2xl">Research Papers</span>
          </div>
          <div class="border-2 rounded-md p-1 border-sea-blue">
            <li class="list-none underline">
              <ul><a href="http://www.accountingsolutions.com.au/CAS/2013_Mediterranean_files/Pages186-192.pdf">The Mediterranean</a></ul>
              <ul><a href="https://www.nature.com/articles/nature04070">Determinants of woody cover in African savannas</a></ul>
            </li>
          </div>
        </div>
      </div>
      <div id="videos" class="w-1/2">
        <div class="pb-2">
          <span class="text-2xl">Videos</span>
        </div>
        <div>
          <ReactPlayer url="https://www.youtube.com/watch?v=G52dUQLxPzg" />
          <ReactPlayer url="https://www.youtube.com/watch?v=6nCsGkbT8Es" />
        </div>
      </div>
    </div>
  );
}