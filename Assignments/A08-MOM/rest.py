import requests
import json
import xmltodict
from pprint import pprint as pp


name = 'Klaus'
URL = 'http://www.thomas-bayer.com/restnames/name.groovy?name='

data = requests.get(URL+name)
xpars = xmltodict.parse(data.text)

male = xpars['restnames']['nameinfo']['male'] == 'true'
female = xpars['restnames']['nameinfo']['female'] == 'true'

if male and female:
    prefix = ' Mx. '
elif male:
    prefix = ' Mr. '
elif female:
    prefix = ' Ms. '

print(f'Dear{prefix}{name.capitalize()}')