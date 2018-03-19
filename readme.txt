Rate
 - what crypto currency we talk about
 - what actual rate it is
 - timestamp of request
 - origin
 
 ExchangeReader
   +--Response readPrice( Request )
   
 Request
   +--currency
 
 Response
   +--Server-ID
   +--Date-Of-Request
   +--Language
   +--Rate
      +-- rate (value)
      +-- baseCurrency
      +-- targetCurrency