class SanchezGrailsPlugin {
	def version = '0.1-SNAPSHOT'
	def grailsVersion = '2.0 > *'
	def dependsOn = [:]
	def pluginExcludes = [
	'grails-app/views/error.gsp'
	]
	def title = 'Sanchez Plugin' // Headline display name of the plugin
	def author = 'Alex Anderson'
	def authorEmail = 'http://www.github.com/alxndrsn'
	def description = '''\
		Grails plugin for sanchez.js javascript/html/GSP templates on client and server-side.
	'''

	// URL to the plugin's documentation
	def documentation = 'https://github.com/alxndrsn/grails-sanchez-plugin'
	def license = 'APACHE'
	def doWithWebDescriptor = { xml ->
	}

	def doWithSpring = {
	}

	def doWithDynamicMethods = { ctx ->
	}

	def doWithApplicationContext = { applicationContext ->
	}

	def onChange = { event ->
	}

	def onConfigChange = { event ->
	}

	def onShutdown = { event ->
	}
}
