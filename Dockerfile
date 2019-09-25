FROM node:alpine

WORKDIR '/app'

COPY package.jason.

RUN npm install

COPY . . 

CMD ["npm","start"]
