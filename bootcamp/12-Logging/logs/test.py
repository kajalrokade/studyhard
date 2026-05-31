from logger import logging

def add(a,b):
    logging.debug("Inside the add function")


logging.info("Add function will call now")
add(5,3)