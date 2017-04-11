package org.cghr;

def gitVersion(){
	return "git --version".execute().text
}