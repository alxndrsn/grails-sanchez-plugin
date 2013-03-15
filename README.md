Sanchez Grails Plugin
=====================

Grails plugin for [sanchez.js Javascript templating framework][1].

This plugin allows simple inclusion of Sanchez templates in a Grails project, and re-use of grails partial templates on the client side.

# Use

## Install sanchez-grails-plugin

In your Grails `BuildConfig.groovy`, add the following to the `plugins` section:

	plugins {
		...
		runtime ':sanchez:{{current_version}}'
		...
	}

## Including the javascript

Next, you'll want to include the sanchez.js javascript file in your app.

Sanchez defines a resource module called `sanchez` in `SanchezResources.groovy`.

### With Grails Resources plugin

#### In ApplicationResources.groovy

	dependsOn 'jquery, sanchez'

#### Directly in a GSP

	<r:require modules="jquery,sanchez"/>

## Include a template

### Render a Grails partial template as a sanchez template

Inside a standard GSP file, you can include a gsp partial template as a sanchez template using the sanchez taglib:

	<sanchez:render template="/section/tname" id="my_template" runtimeVars="data"/>

This will render `/grails-app/views/section/_tname.gsp` as a sanchez template with id `my_template`.

## Use the template

In your javascript:

	sanchez.replaceWith("#oldContainer", "my_template", {data:"whatever"});

# Examples

* [simple Grails project using a sanchez template][2]
* [more examples of sanchez.js usage (sanchez.js website)][1]

[1]: http://alxndrsn.github.com/sanchez.js
[2]: https://github.com/alxndrsn/grails-sanchez-example/blob/master/grails-app/views/thing/list.gsp

