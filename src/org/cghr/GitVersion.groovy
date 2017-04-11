package org.cghr;

def gitVersion(){
	return "/bin/git --version".execute().text
}