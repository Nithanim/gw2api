# gw2api

## Description
This is a (yet to be completed) library to access the [api of Guild Wars 2](https://wiki.guildwars2.com/wiki/API:Main). The aim is to be able to use the api as easily as descibed in the official wiki with paths accessing the various endpoints.

## How to use
At first you need to get the GuildWars2Api object by simply by calling
```java
GuildWars2Api gw2api = new GuildWars2Api();
```
[You might need to use this instead if you get SSL errors](/../../issues/15):
```java
GuildWars2Api gw2api = new GuildWars2Api(new GuildWars2ApiDefaultConfigWithGodaddyFix());
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

Our last example deals with the transactions a player made on the tradingpost. This is very dynamic so we use the pagination that is provided in the response from the server.
We ask for the latest 10 entries and then we get the number of the last page from it. At last we retrieve all results on this page and print the number of the entries to stdout.
```java
TransactionsResource tr = gw2api.commerce().transactions();

int pageSize = 10;
PaginationResult<Transaction[]> res = tr.historyBuysExtendedWithPageSize(apikey, pageSize);
int lastPage = res.getPageTotal() - 1;

System.out.println(
	tr.historyBuysExtendedWithPageAndPageSize(
		apikey,
		lastPage,
		pageSize
	).getResultCount()
);
```

## How to get this library
Add the dependency to your pom.xml if you use maven:
```xml
<dependencies>
    <dependency>
        <groupId>me.nithanim.gw2api</groupId>
        <artifactId>gw2api</artifactId>
        <version>0.0.8</version>
    </dependency>
</dependencies>
```
or to your build.gradle if you are using gradle:
```groovy
dependencies {
    compile 'me.nithanim.gw2api:gw2api:0.0.8'
}
```

### Building
At first you need to clone this repositoy. You can do this by either typing ```git clone https://github.com/Nithanim/gw2api.git``` if git is installed or download the source as zip file.
With [Maven](https://maven.apache.org/) (needs to be installed) simply type ```mvn package``` to get the jars or ```mvn install``` to build and insert the file into your local maven repository.

## Contributing
### Issues
If you find anything that does not work as intended, feel free to open an issue
in the issue tracker. When reporting an issue it helps a lot if you include
what you have done to produce the issue. As an example, if you want to retrieve 
an item which is missing some information, it is essential that you include the
item id.
### Code
This library is built to reflect the structure of the official api.
Therefore, every package below the ....v2.api.* matches the path of a "folder"
of the
[official api](https://api.guildwars2.com/v2) ([wiki](https://wiki.guildwars2.com/wiki/API:2)).
There are some exceptions because the resulting java mapping might be cumbersome
to use or because it is not buildable in java in the same manner.
As a rule of thumb, you should match the style of your code to the same style
that is already used in the repository. I am mostly using the
[Google Java Style](https://google.github.io/styleguide/javaguide.html) and the
(mostly again; sorry) default NetBeans formatter for automatically formatting the
code.
Your code does not need to be perfectly formatted. Before pulling I will take
care of everything for you.
As far as your commit messages are concerned, double-check that they have a
reasonable description. Additionally, make sure that the history is not
cluttered with "oops" and "fix for real now". Please squash or rebase them
together before submitting your pull request!
This rules save me a lot of time reviewing and pulling your code in. -
Thank you!
