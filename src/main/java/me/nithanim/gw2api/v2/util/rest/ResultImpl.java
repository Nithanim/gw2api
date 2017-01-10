package me.nithanim.gw2api.v2.util.rest;

import javax.ws.rs.core.Response;

@lombok.EqualsAndHashCode
@lombok.ToString(doNotUseGetters = false)
public class ResultImpl<T> implements PaginationResult<T> {
    private final Response response;
    private final Class<T> clazz;
    private T result;
    private int pageSize = -1;
    private int pageTotal = -1;
    private int resultCount = -1;
    private int resultTotal = -1;

    public ResultImpl(Response Response, Class<T> clazz) {
        this.response = Response;
        this.clazz = clazz;
    }

    @Override
    public T getResult() {
        if (result == null) {
            String json = response.readEntity(String.class);
            result = RequestHelperImpl.jsonToObject(json, clazz);
        }
        return result;
    }

    @Override
    public int getPageSize() {
        if (pageSize == -1) {
            pageSize = Integer.parseInt(
                response.getStringHeaders().getFirst("X-Page-Size")
            );
        }
        return pageSize;
    }

    @Override
    public int getPageTotal() {
        if (pageTotal == -1) {
            pageTotal = Integer.parseInt(
                response.getStringHeaders().getFirst("X-Page-Total"));
        }
        return pageTotal;
    }

    @Override
    public int getResultCount() {
        if (resultCount == -1) {
            resultCount = Integer.parseInt(
                response.getStringHeaders().getFirst("X-Result-Count"));
        }
        return resultCount;
    }

    @Override
    public int getResultTotal() {
        if (resultTotal == -1) {
            resultTotal = Integer.parseInt(
                response.getStringHeaders().getFirst("X-Result-Total"));
        }
        return resultTotal;
    }
}
