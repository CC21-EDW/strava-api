# strava-api
A template to use when starting a new open source project.

## perform a repository wide search and replace for "repository-template-java" and the "target-repo-name"

e.g. by using

```
cp -R repository-template-java/ new-name && cd new-name && git config --local --unset remote.origin.url && git config --local --add remote.origin.url git@github.com:baloise/new-name.git && git reset --hard $(git commit-tree FETCH_HEAD^{tree} -m "Initial contribution") &&  git grep -l 'repository-template-java' | xargs sed -i '' -e 's/repository-template-java/new-name/g' && mvn clean verify && git add -A && git commit -m "Rename from template to new-name" && cd ..
```
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/bf6fa237dd934970991ecba2c66db23e)](https://app.codacy.com/app/CC21-EDW/strava-api?utm_source=github.com&utm_medium=referral&utm_content=CC21-EDW/strava-api&utm_campaign=Badge_Grade_Dashboard)
[![DepShield Badge](https://depshield.sonatype.org/badges/CC21-EDW/strava-api/depshield.svg)](https://depshield.sonatype.org/badges/CC21-EDW/strava-api/)
![Build Status](https://github.com/CC21-EDW/strava-api/workflows/CI/badge.svg)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=CC21-EDW_strava-api&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=CC21-EDW_strava-api)

## the [docs](docs/index.md)

## releasing

Run e.g. on main: `mvn -B release:prepare` e.g. via [![Gitpod ready-to-code](https://img.shields.io/badge/Gitpod-ready--to--code-blue?logo=gitpod)](https://gitpod.io#https://github.com/CC21-EDW/strava-api)

Subsequently the GitHub action worksflow "create release" will pick up the published tag and release and deploy the artifacts in the Github package registry.

## Build behind Firewall

### Maven
Add proxy to settings.xml (however in IntelliJ that does not properly work):
```
<setings
	<proxies>
		<proxy>
			<id>http-proxyproxy</id>
			<active>true</active>
			<protocol>http</protocol>
			<host>localhost</host>
			<port>8888</port>
		</proxy>
	</proxies>
</settings>
```

### IntelliJ
File > Settings > Build, Execution, Deployments > Maven > Runner > VM Arguments
```
-DproxyHost=localhost -DproxyPort=8888 -DproxySet=true -Dio.swagger.parser.util.RemoteUrl.trustAll=true -Dio.swagger.v3.parser.util.RemoteUrl.trustAll=true
```