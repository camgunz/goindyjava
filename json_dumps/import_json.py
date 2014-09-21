#!/usr/bin/env python

import os
import sys
import json
import pprint
import operator

data_file_names =(
    'activities.json',
    'activity_types.json',
    'home_slides.json',
    'lodgings.json',
    'lodging_types.json',
    'restaurants.json',
    'restaurant_types.json'
)

def main():
    for data_file_name in data_file_names:
        fobj = open(data_file_name)
        rows = sorted(json.loads(fobj.read()), key=operator.itemgetter('id'))
        fobj.close()
        for row in rows:
            pprint.pprint(row)

main()

