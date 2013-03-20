package sanchez

class SanchezTagLib {
	static namespace = 'sanchez'

	def render = { att, body -> out << template(att, body) }

	def template = { att, body ->
		def templateId = att.remove 'id'
		if(!att.template) {
			att.template = templateId
		}

		def runtimeVars = att.remove('runtimeVars')?.split(",")*.trim()
		if(runtimeVars) {
			if(!att.model) att.model = [:]
			runtimeVars.each { att.model[it] = "{{$it}}" }
		}

		out << '<script id="' + templateId + '" type="text/x-sanchez-template">'
		out << g.render(att)
		out << '</script>'
	}
}

