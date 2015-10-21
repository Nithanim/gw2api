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

### Repository
The releases are available in the [jCenter](https://bintray.com/bintray/jcenter) repository.
You can use this to add jcenter to the repository list of maven:
```xml
<repositories>
	<repository>
		<id>jcenter</id>
		<url>http://jcenter.bintray.com</url>
		<snapshots>
			<enabled>false</enabled>
			<updatePolicy>never</updatePolicy>
			<checksumPolicy>fail</checksumPolicy>
		</snapshots>
		<releases>
			<enabled>true</enabled>
			<checksumPolicy>fail</checksumPolicy>
		</releases>
	</repository>
</repositories>
```
or to gradle:
```groovy
repositories {
	maven {
		url "http://jcenter.bintray.com"
	}
}
```

After that set this library as a dependency. To do this add this to your pom.xml if you use maven:
```xml
<dependencies>
	<dependency>
		<groupId>me.nithanim.gw2api</groupId>
		<artifactId>gw2api</artifactId>
		<version>0.0.2</version>
	</dependency>
</dependencies>
```
or this to your build.gradle if you are using gradle:
```groovy
dependencies {
	compile 'me.nithanim.gw2api:gw2api:0.0.2'
}
```

### Building
At first you need to clone this repositoy. You can do this by either typing ```git clone https://github.com/Nithanim/gw2api.git``` if git is installed or download the source as zip file.
With [Maven](https://maven.apache.org/) (needs to be installed) simply type ```mvn package``` to get the jars or ```mvn install``` to build and insert the file into your local maven repository.