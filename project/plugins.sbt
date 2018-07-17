addSbtPlugin("com.lightbend.lagom"     % "lagom-sbt-plugin"  % "1.4.6")
addSbtPlugin("com.github.stonexx.sbt"  % "sbt-webpack"       % "1.3.1")
addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "5.2.4")
addSbtPlugin("com.lightbend.rp"        % "sbt-reactive-app"  % "1.3.0")
addSbtPlugin("com.lightbend.cinnamon"  % "sbt-cinnamon"      % "2.9.2")

resolvers += Resolver.url("lightbend-commercial", url("https://repo.lightbend.com/commercial-releases"))(Resolver.ivyStylePatterns)
