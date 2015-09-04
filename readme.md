# gw2api

## Description
This is a (yet to be completed) library to access the [api of Guild Wars 2](https://wiki.guildwars2.com/wiki/API:Main). The aim is to be able to use the api as easily as descibed in the official wiki with paths accessing the various endpoints.

## How to use
At first you need to get the GuildWars2Api object by simply by calling
```java
GuildWars2Api gw2api = new GuildWars2Api();
```
The resulting object can be used multiple times, even concurrently, so it is adivced to store it somewhere.

When reading the official wiki pages you will find out that the bank can be accessed through /v2/account/bank with an apikey. With this library you can simply type
```java
Item[] items = gw2api.account().bank(apikey);
```
to get all the items in the bank of the player who created the apikey. The result is exactly the same as described in the official wiki pages.

As another example we want to use the /v2/commerce/listings endpoint. Since there are more possible options (retrieve all available listings, get the data for only one, ...) some get(\*) methods are available:
```java
int[] allListingsAvailable = gw2api.commerce().listings().getOverview();
Listing listing = gw2api.commerce().listings().get(allListingsAvailable[0]);
```

## Building
At first you need to clone this repositoy. You can do this by either typing ```git clone https://github.com/Nithanim/gw2api.git``` if git is installed or download the source as zip file.
With [Maven](https://maven.apache.org/) (needs to be installed) simply type ```mvn package``` to get the jars or ```mvn install``` to build and insert the file into your local maven repository.